### Online Pizza Order Application 
 #### Requeriments
 ##### Customers should be able to select from the following components
   * A dough type
   * Sauce
   * Cheese
   * Veggies
   * Protein
   * Toppings/Finishing touches
   ##### Users or Customets can either built their own pizza from blank pizza image or can order ready made pizza online
   for each topping the user selects, those toppings should show up on that pizza image.
   
   Each pizza should start off with a base price (one dough type, one sauce, one cheese and two toppings). Additional toppings should be    calculated and added to the base price.

   Upon submission, generate an itemized receipt with the user's selections, cost of each additional topping and date/time of the order    should also be captured.
   
  Users can either log into their account to place and order or create an account upon checking out. Users should be able to see a list   of their order history when logged into their accounts.
   
   Users should be notified by text message once their order has been submitted(we used twilio for the text message and 
   text can be sent only for the user who create twilio account and used his own twilio number)
 
   Reports to generate by the admin:

   A list of all customers
   Top 3 pizza toppings
   Total sales
   Find a customer by name

  Admins should also have the ability to add/remove pizza toppings from the ordering system.
  
  
  1. Custemer ( User )
    Properties
     firstName
     LatsName
     phoneNumber
     email
     
     
 2. Order class
    pizzaName
    date 
    basePrice
    tax

 3. Toping Class
    topingItem
    topingPrice
    
    
    
