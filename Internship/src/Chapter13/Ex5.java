package Chapter13;

public class Ex5 {

	public static void main(String[] args) {
		String web = "http://www.devbg.org/forum/index.php";

		String protocol = web.substring(0, web.indexOf(":"));
		String server = web.substring(web.indexOf("//") + 2,
				web.indexOf('/', 8));
		String resource = web.substring(web.indexOf("/", 8), web.length());
		System.out.printf("[protocol]=\"%s\"%n[server]=\"%s\"%n[resource]=\"%s\"%n",
				protocol, server, resource);
	}

}
