# java-aqa-course

Java automation quality assurance course

### Session 7 covers

1. [list](list)
2. [set](set)
3. [map](map)

### Home-task

1. Create class User w/ fields: String nickname, password
    - Add constructor, accessors, toString if needed
2. Create class Demo to be able to demo the app here
    - create 3 users:
      User user1 = new User("nmelnk", "Abcd1234");
      User user2 = new User("pkel", "Efgh5678");
      User user3 = new User("nonk", "Ijkl#!78");
    - create Map<Object, Object> userCredentials
    - create List<User> users that consists of users above
3. Now we need to encrypt partially users' passwords:
    - we need to replace numbers in passwords with special characters: i.e. Abcd1234 -> Abcd####
    - we need to keep user's passwords as it were initially but put new encrypted values to the userCredentials(map
      above)
4. As result print userCredentials map and users list

##### HINT**

U can use Character.isDigit(char c) to check if character is digit