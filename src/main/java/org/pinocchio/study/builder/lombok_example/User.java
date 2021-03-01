package org.pinocchio.study.builder.lombok_example;

/**
 * @Author cpz
 * @Date 2021/3/1
 * @Description: lombok 实例
 */
public class User {

    private String userName;

    private String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public static User.UserBuilder builder() {
        return new User.UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public static class UserBuilder {
        private String userName;
        private String passWord;

        public UserBuilder() {
        }

        public User.UserBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public User.UserBuilder passWord(String passWord) {
            this.passWord = passWord;
            return this;
        }

        public User build() {
            return new User(this.userName, this.passWord);
        }

        @Override
        public String toString() {
            return "User.UserBuilder(username=" + this.userName + ", password=" + this.passWord + ")";
        }
    }
}
