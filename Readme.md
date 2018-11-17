piza Order

Classes

 1. Custemer ( be able toselect topings)
     name
     email
     phoneNumber

 2. Order class
    pizzaName
    date 
    basePrice
    tax

 3. Toping Class
    topingItem
    topingPrice
    
    
    extra
     public CloudinaryConfig(@Value("${cloud.key}")  String key,
                                @Value("${cloud.secret}") String secret,
                                @Value("${cloud.name}") String cloud){
            cloudinary = Singleton.getCloudinary();