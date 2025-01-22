///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package initializer;
//
//import Entities.Card;
//import javax.annotation.PostConstruct;
//import javax.ejb.Singleton;
//import javax.ejb.Startup;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
///**
// *
// * @author khesr
// */
//@Singleton
//@Startup
//public class InitializeDB {
//    
//    @PersistenceContext(unitName = "myCart")
//    EntityManager em;
//    
//    String[] pictures = {"D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\book.jpg","D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\camera.jpg"
//    ,"D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\chair.jpg","D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\graphic.jpg",
//    "D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\lapton.jpg","D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\pan.jpg"
//    ,"D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\ram.jpg","D:\\DOWLNOAD_C\\Downloads\\mega\\games\\cart_pictures\\ssd.jpg"};
//    
//
//    String[] description = {"Sacred book of avestan","Canon Camera 32mp","Gaming chair for comfort"
//    ,"Nvidia Graphic Card","HP 5th Generation laptop","Cooking pan for everything",
//    "16GB DDR5 RAM","2TB SSD card 6th generation"};
//    
//    String[] titles = {"Zend Avesta","Camera","Chair","Graphic Card","Laptop PC","PAN","RAD DDR5","SSD"};
//    
//    String[] prices = {"123","234","233","200","199","399","70","222"};
//    
//    
//    
//    
//   
//    @PostConstruct
//    public void populateDB(){
//        
//        for(int i =0; i<8; i++){
//            Card card = new Card();
//            card.setSrc(pictures[i]);
//            card.setBody(description[i]);
//            card.setImgInfo(titles[i]);
//            card.setTitle(titles[i]);
//            card.setSubtitle(prices[i]);
//            
//            em.persist(card);
//        
//        }
//    
//   }
//}
