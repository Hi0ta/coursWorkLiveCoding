public class Password {
    private String enterPassword;
    public Password(String enterPassword) {
        this.enterPassword = enterPassword;
    }
    public String getenterPassword() {
        return enterPassword;
    }
    public void setPassword(String enterPassword) {
        this.enterPassword = enterPassword;
    }
    @Override
    public String toString() {
        return "пароль: " + enterPassword;
    }
    public void checkPassword() throws WrongPasswordException {
        if (enterPassword.length() != 9) {
            throw new WrongPasswordException("Пароль должен содержать 9 символов");
        }
        this.enterPassword = enterPassword;
    }
}
