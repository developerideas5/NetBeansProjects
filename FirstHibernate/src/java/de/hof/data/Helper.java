/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.hof.data;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author shruti
 */
public class Helper {
   

    private Session session = null;

    public Helper() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
     public Article getArticle(final long artId) {
        session.beginTransaction();
        Article art = (Article) session.get(Article.class, new Long(artId));
        session.getTransaction().commit();
        return art;
    }
     public void addArticle(final String title) {
        session.beginTransaction();
        Article art = new Article(title);
        session.save(art);
        session.getTransaction().commit();
    }
       public List searchArticle(final String keyword) {
            List<Article> artList = null;
            try {
                session.beginTransaction();
                Query q = session.createQuery(
                    "from Article as art where art.status = ’published’ " +
                     "and art.title like ’%"+ keyword +"%’"
                 );                 
                 artList = (List<Article>) q.list();
                 return artList;
             } catch (Exception e) {
                 //problems
                 return null;
             }
    } 
}

