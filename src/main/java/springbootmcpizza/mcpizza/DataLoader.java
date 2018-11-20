//package springbootmcpizza.mcpizza;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Executable;
//import java.util.Arrays;
//
//@Component
//public class DataLoader implements CommandLineRunner {
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
//    @Autowired
//    OrderRepository orderRepository;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public void run(String... strings) throws Exception{
//        roleRepository.save(new Role("USER"));
//        roleRepository.save(new Role("ADMIN"));
//
//        Role adminRole = roleRepository.findByRole("ADMIN");
//        Role userRole = roleRepository.findByRole("USER");
//
//        User user = new User("hailu@gmai.com", passwordEncoder.encode("password"), "password", "2024560981", true,
//                "hailu");
//        user.setRoles(Arrays.asList(userRole));
//        userRepository.save(user);
//
//        user = new User("admin@gmail.com", passwordEncoder.encode("password"),
//                "Admin",        "3021536548", true,       "admin");
//        user.setRoles(Arrays.asList(adminRole));
//        userRepository.save(user);
//
////        Order orde = new Order("middeium", 12, "12-03-2018", 6);
//
//
//    }
//}