public class Project {

    public String getGreeting() {
        return "Hello! Let's chat.";
    }

    public String getResponse(String statement) {
        if (statement.indexOf("no") >= 0) {
            return "Why so negative?";
        } else if (statement.indexOf("mother") >= 0 
                || statement.indexOf("father") >= 0 
                || statement.indexOf("sister") >= 0 
                || statement.indexOf("brother") >= 0) {
            return "Tell me more about your family.";
        } else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
            return "Tell me more about your pets.";
        } else if (statement.trim().isEmpty()) {
            return "Say something, please.";
        } else {
            return getRandomResponse();
        }
    }

    private String getRandomResponse() {
        int r = (int) (Math.random() * 4);
        if (r == 0) return "Interesting.";
        if (r == 1) return "Okay.";
        if (r == 2) return "I haven't heard that before.";
        return "What else could you tell me about that?";
    }
}
