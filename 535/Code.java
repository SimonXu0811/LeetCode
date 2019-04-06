public class Codec {

	private HashMap<String, String> map = new HashMap<String, String>();

	public String encode(String longUrl) {//加密就返回key值
        map.put("encode" + longUrl.hashCode(), longUrl);
        return "encode" + longUrl.hashCode();
    }

    public String decode(String shortUrl) {//解密就返回value
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
