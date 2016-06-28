/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningerrands.enums;

import runningerrands.model.Map;
import runningerrands.model.Scene;

/**
 *
 * @author brittanyhuntington
 */
public class CreateScenes {

    private static class location {

        public location() {
        }
    }
     public enum SceneType {
        start,
        pizza,
        library,
        mechanic,
        hospital,
        elementarySchool,
        middleSchool,
        highSchool,
        hairDresser,
        postOffice,
        home,
        mall,
        groceryStore,
        gasStation,
        bank,
        sportingStore,
        petStore,
        homeImprovementStore,
        ymca,
        church,
        babysitter,
        doctorOffice,
        dmv,
        businessOffice,
        loanOffice,
        finish;
        
        
    }
    private static Scene[] createScenes() {
        Scene [] scenes = new Scene[SceneType.values().length];
            Scene startingScene = new Scene();
            startingScene.setDescription(
                    "Life is all full of errands. Some days it seems to get mundane."
                   + "Everytime you go on errands, something seems to go wrong,"
                   + "it's like you're living in a text-based game or something."
                   + "But you've got to make the most of this thing called 'life'."
                   + "You have children, a job, a spouse, and a dog. Not to mention"
                   + "your Church calling. There's not enough time in the day to do all the"
                   + "things you need to do. But, you've got to. So, good luck."
            );
            startingScene.setMapSymbol (" ST ");
            startingScene.setBlocked(false);
            startingScene.setTravelTime(1);
            scenes[SceneType.start.ordinal()] = startingScene;
            
            
            Scene pizzaParlorScene = new Scene();
            pizzaParlorScene.setDescription (
                        "Welcome to Joe's Pizza! There is the smell of delicious pizza"
                                + "wafting from the oven. You love pizza. Who doesn't?"
                                + "The line is really long, because this is the best pizza"
                                + "place in town. Probably even in the county! Luckily you live nearby!"
                                + "There's that copule siting in that booth in the corner again. They "
                                + "seem so happy. You wish you could be happy like them. But there's so much"
                                + "to do. Now, what did you come here for again? You can either work if you"
                                + "are a pizza delivery driver, or you can order pizza."
             );
            pizzaParlorScene.setMapSymbol ("PP");
            pizzaParlorScene.setBlocked(false);
            pizzaParlorScene.setTravelTime(1);
            scenes[SceneType.pizza.ordinal()] = pizzaParlorScene; 
       
            Scene libraryScene = new Scene();
            libraryScene.setDescription (
                        "This is the public library. The smell of books is always"
                                + "one of the best things you could ever smell."
                                + "Here, you can get a new library card, if your foolish"
                                + "self lost it...again...or you can pick up books "
                                + "that you need for your sanity (but you probably are just "
                                + "picking up books for your kids). You can also drop"
                                + "off books and pay those late fees (since you probably forgot"
                                + "to return your books for three weeks...again. Did I just"
                                + "ruin the library for you? I hope not! It's a great place to get free books"
                                + "for two weeks!" 
             );
            libraryScene.setMapSymbol ("LI");
            libraryScene.setBlocked(false);
            libraryScene.setTravelTime(1);
            scenes[SceneType.library.ordinal()] = libraryScene; 
            
            Scene mechanicScene = new Scene();
            mechanicScene.setDescription (
                        "This is Jeb's Automitive where you can get your car fixed"
                                + "or get an oil change. You work here if you"
                                + "are a mechanic. We don't take any old mechanic here,"
                                + "you have to be really knoledgable on cars! If you're here"
                                + "for an oil change, we have a special going on that you can"
                                + "get an oil change AND a tire rotation for $24.99. It's a steal!" 
             );
            mechanicScene.setMapSymbol ("ME");
            mechanicScene.setBlocked(false);
            mechanicScene.setTravelTime(1);
            scenes[SceneType.mechanic.ordinal()] = mechanicScene; 
            
            Scene hospitalScene = new Scene();
            hospitalScene.setDescription (
                        "The hospital is where good and bad things happen. People can "
                                + "have babies here, which is great! Or, people can be treated"
                                + "for cancer here, which isn't so great. You probably won't do either"
                                + "of those things. You are probably here to visit a family member"
                                + "or get that injury taken care of. We're here to help. You work here"
                                + "if you are a nurse. Please wash your hands often to prevent"
                                + "disease!"
             );
            hospitalScene.setMapSymbol ("HP");
            hospitalScene.setBlocked(false);
            hospitalScene.setTravelTime(1);
            scenes[SceneType.hospital.ordinal()] = hospitalScene; 
            
            Scene elementarySchoolScene = new Scene();
            elementarySchoolScene.setDescription (
                        "This is your town's elementary school. It's not the best in the sate or "
                                + "anything, but it does fine for a school. You have a kid in this "
                                + "school, so you are here to pick them up, drop them off, or bring them"
                                + "something...kids are always forgetting something. The school day goes from 9am "
                                + "to 2pm."
             );
            elementarySchoolScene.setMapSymbol ("ES");
            elementarySchoolScene.setBlocked(false);
            elementarySchoolScene.setTravelTime(1);
            scenes[SceneType.elementarySchool.ordinal()] = elementarySchoolScene; 
            
            Scene middleSchoolScene = new Scene();
            middleSchoolScene.setDescription (
                        "This is your town's middle school. It's full of preteens who"
                                + "don't know they smell bad yet. What a highlight to your"
                                + "already busy day. You have a kid who attends this school. You"
                                + "can pick your kid up from school, drop them off for school, or, if"
                                + "you're lucky drop them off at a dance!"
             );
            middleSchoolScene.setMapSymbol ("MS");
            middleSchoolScene.setBlocked(false);
            middleSchoolScene.setTravelTime(1);
            scenes[SceneType.middleSchool.ordinal()] = middleSchoolScene; 
            
            Scene highSchoolScene = new Scene();
           highSchoolScene.setDescription (
                        "This is your town's high school. You have a kid who attends this school."
                                + "They're a teenager now, and want all that freedom. But, at least they don't"
                                + "smell bad anymore...you work here if you're a teacher. Since your kid"
                                + "can drive themselves, you can come see them in their play that they "
                                + "really want you to attend. Or, you can go with your kid to an event."
             );
            highSchoolScene.setMapSymbol ("HS");
            highSchoolScene.setBlocked(false);
            highSchoolScene.setTravelTime(1);
            scenes[SceneType.highSchool.ordinal()] = highSchoolScene; 
            
            Scene hairDresserScene = new Scene();
            hairDresserScene.setDescription (
                        "Welcome to Martia's Salon! It smells of burnt hair and "
                                + "sun tan lotion. There are always people waiting in the "
                                + "lobby to get their hair done. It's a great place to "
                                + "meet new people. You work here if you are a hair dresser."
                                + "You can get your haircut here for yourself, or a kid, but"
                                + "get in line first."
             );
            hairDresserScene.setMapSymbol ("HD");
            hairDresserScene.setBlocked(false);
            hairDresserScene.setTravelTime(1);
            scenes[SceneType.hairDresser.ordinal()] = hairDresserScene; 
            
            Scene postOfficeScene = new Scene();
            postOfficeScene.setDescription (
                        "Welcome to the United States Postal Service Office. Here, "
                                + "you will most likely wait in a really long line that"
                                + "takes forever to move. It's one of the last places"
                                + "you want to be, but you might need to mail a letter"
                                + "or package. Or check your P.O. box that you're not sure"
                                + "why you have since you live in a house that has a "
                                + "perfectly fine mail box. You work here if you are a postal"
                                + "worker."
             );
            postOfficeScene.setMapSymbol ("PO");
            postOfficeScene.setBlocked(false);
            postOfficeScene.setTravelTime(1);
            scenes[SceneType.postOffice.ordinal()] = postOfficeScene; 
            
            Scene homeScene = new Scene();
            homeScene.setDescription (
                        "You are home! This is your happy place."
                                + "You can check your fuel tank here."
                                + "This is where you get assigned errands."
                                
             );
            homeScene.setMapSymbol ("HO");
            homeScene.setBlocked(false);
            homeScene.setTravelTime(1);
            scenes[SceneType.home.ordinal()] = homeScene; 
            
            
            Scene mallScene = new Scene();
            mallScene.setDescription (
                        "Welcome to the mall! There's always so many people here"
                                + "and nowhere to park. You should have fun anyway. "
                                + "You can shop here. Don't get too tempted from "
                                + "the free samples at the Japanese steak house."
             );
            mallScene.setMapSymbol ("ML");
            mallScene.setBlocked(false);
            mallScene.setTravelTime(1);
            scenes[SceneType.mall.ordinal()] = mallScene; 
            
            Scene groceryStoreScene = new Scene();
            groceryStoreScene.setDescription (
                        "This is your town's grocery store. It's not as big as a"
                                + "Meijer or anything, but it always has "
                                + "the things you need in stock. It's just a little"
                                + "more expensive than other grocery stores you've"
                                + "been to throughout your life. Here, you can shop"
                                + "for those things on your grocery list. You've got"
                                + "to feed your kids something other than pizza,"
                                + "right?"
             );
            groceryStoreScene.setMapSymbol ("GS");
            groceryStoreScene.setBlocked(false);
            groceryStoreScene.setTravelTime(1);
            scenes[SceneType.groceryStore.ordinal()] = groceryStoreScene; 
            
            Scene gasStationScene = new Scene();
            gasStationScene.setDescription (
                        "This is your gas station. Here, you can get gas for your car."
                                + "Hopefully gas isn't too expensive. We really have nothing"
                                + "to do with that, it's all the government."
             );
            gasStationScene.setMapSymbol ("GA");
            gasStationScene.setBlocked(false);
            gasStationScene.setTravelTime(1);
            scenes[SceneType.gasStation.ordinal()] = gasStationScene; 
            
            Scene bankScene = new Scene();
            bankScene.setDescription (
                        "This is your bank. It's a pretty fair bank. They don't "
                                + "charge outrageous things like those other"
                                + "banks out there. Here, you can check your "
                                + "account balance (don't you have a smartphone yet?)"
                                + "or, you can deposit your paycheck."
             );
            bankScene.setMapSymbol ("BA");
            bankScene.setBlocked(false);
            bankScene.setTravelTime(1);
            scenes[SceneType.bank.ordinal()] = bankScene; 
            
            Scene sportingStoreScene = new Scene();
            sportingStoreScene.setDescription (
                        "Welcome to Sport's Depot! We have the best prices, and "
                                + "we even price match if you find something "
                                + "cheaper online. Here, you can get anything you"
                                + "need sports related."
             );
            sportingStoreScene.setMapSymbol ("SG");
            sportingStoreScene.setBlocked(false);
            sportingStoreScene.setTravelTime(1);
            scenes[SceneType.sportingStore.ordinal()] = sportingStoreScene; 
            
            Scene petStoreScene = new Scene();
            petStoreScene.setDescription (
                        "Welcome to Pet Town! You can look at all the cute"
                                + "animals we have for sale. But, you know you're not"
                                + "allowed to get any. You already have a dog. While "
                                + "you're here, you can get anything you need for"
                                + "your pet."
             );
            petStoreScene.setMapSymbol ("PS");
            petStoreScene.setBlocked(false);
            petStoreScene.setTravelTime(1);
            scenes[SceneType.petStore.ordinal()] = petStoreScene; 
            
            Scene homeImprovementScene = new Scene();
            homeImprovementScene.setDescription (
                        "Welcome to Home Mart! it always smells like lumber in here,"
                                + "which is comfoting. Just don't slip on the sawdust"
                                + "that's always on the floor. Here, you can get anything"
                                + "you need to fix up your house. We anything you"
                                + "would need instock, or it's free!"
             );
            homeImprovementScene.setMapSymbol ("HI");
            homeImprovementScene.setBlocked(false);
            homeImprovementScene.setTravelTime(1);
            scenes[SceneType.homeImprovementStore.ordinal()] = homeImprovementScene; 
            
            Scene ymcaScene = new Scene();
            ymcaScene.setDescription (
                        "This is the YMCA. You know it's fun to stay here!"
                                + "But, you won't find any Village People here. "
                                + "Here, you can enjoy that great smell of chlorine while your kid has"
                                + "swim practice. Or you can take your kid to dance or soccer practice."
                                + "This is a great part of your community. Thanks for being a member"
                                + "and supporting the YMCA."
             );
            ymcaScene.setMapSymbol ("YM");
            ymcaScene.setBlocked(false);
            ymcaScene.setTravelTime(1);
            scenes[SceneType.ymca.ordinal()] = ymcaScene; 
            
            Scene churchScene = new Scene();
            churchScene.setDescription (
                        "This is your ward building for the church you attend. You are "
                                + "a member of the Church of Jesus Christ of Latter-day Saints."
                                + "It's a great church, and everyone is always so friendly."
                                + "There is always some activity going on. Here, you can "
                                + "attend your Sunday meetings (which is 3 hours of church!) "
                                + "or, you can take your kids to their mid-week activities!"
             );
            churchScene.setMapSymbol ("CH");
            churchScene.setBlocked(false);
            churchScene.setTravelTime(1);
            scenes[SceneType.church.ordinal()] = churchScene; 
            
            
            Scene babysitterScene = new Scene();
            babysitterScene.setDescription (
                        "This is you babysitter's house. You shouldn't need a babysitter"
                                + "since you have a teenager, but ever since that one time,"
                                + "you just can't trust them alone. Your baby sitter"
                                + "is a 20 year old college student who needs extra money. So,"
                                + "win-win, right? She doesn't have a car, though, so here"
                                + "you need to pick her up or drop her off. Don't forget"
                                + "to pay her this time!"
             );
            babysitterScene.setMapSymbol ("BS");
            babysitterScene.setBlocked(false);
            babysitterScene.setTravelTime(1);
            scenes[SceneType.babysitter.ordinal()] = babysitterScene; 
            
            Scene doctorOfficeScene = new Scene();
            doctorOfficeScene.setDescription (
                        "This is your doctor's office. You feel like you're here"
                                + "too much, but it seems like some kid is always sick "
                                + "or needing a check up. Hopefully you don't get sick yourself."
             );
            doctorOfficeScene.setMapSymbol ("DO");
            doctorOfficeScene.setBlocked(false);
            doctorOfficeScene.setTravelTime(1);
            scenes[SceneType.doctorOffice.ordinal()] = doctorOfficeScene; 
            
            
            Scene dmvScene = new Scene();
            dmvScene.setDescription (
                        "This is your local DMV. It seems like you're always here"
                                + "way longer than you need to be. The walls are "
                                + "gray, and it's always so hot. Here, you can "
                                + "renew your registration for you vehicle. Or,"
                                + "you might have a speeding ticket to pay."
             );
            dmvScene.setMapSymbol ("DV");
            dmvScene.setBlocked(false);
            dmvScene.setTravelTime(1);
            scenes[SceneType.dmv.ordinal()] = dmvScene; 
            
            Scene businessOfficeScene = new Scene();
            businessOfficeScene.setDescription (
                        "This is Mark and Mark Inc. It's a CPA firm that you work for"
                                + "if you are a secretary. It may seem broing, but"
                                + "the people are nice and the pay is decent."
             );
            businessOfficeScene.setMapSymbol ("BI");
            businessOfficeScene.setBlocked(false);
            businessOfficeScene.setTravelTime(1);
            scenes[SceneType.businessOffice.ordinal()] = businessOfficeScene; 
            
            
            Scene loanOfficeScene = new Scene();
            loanOfficeScene.setDescription (
                        "This is Cash Advance Inc. Here, we can give you a loan to "
                                + "help you get through to your next paycheck. "
                                + "We're pretty reasonable, as long as you're not"
                                + "late! You can pay back your loan here as well. "
                                + "We haven't set up our online pay yet."
             );
            loanOfficeScene.setMapSymbol ("LO");
            loanOfficeScene.setBlocked(false);
            loanOfficeScene.setTravelTime(1);
            scenes[SceneType.loanOffice.ordinal()] = loanOfficeScene; 
            
            Scene finishScene = new Scene();
            finishScene.setDescription (
                        "You did it! You have finished all of your errands."
                                + "I bet you didn't think you could do it."
                                + "I, on the other hand, never doubted you. "
                                + "Contratulations! You can now go to bed and do"
                                + "it all again tomorrow."
             );
            finishScene.setMapSymbol ("FN");
            finishScene.setBlocked(false);
            finishScene.setTravelTime(1);
            scenes[SceneType.finish.ordinal()] = finishScene; 
               
            
     return scenes; 
    }
}
