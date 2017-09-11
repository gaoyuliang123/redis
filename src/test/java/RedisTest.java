import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {
    private Jedis jedis;
    @Before
    public void getJedis() {
        jedis = RedisUtil.getJedis();
    }

    @After
    public void returnSource() {
        RedisUtil.returnResource(jedis);
    }

    /**
     * redis存储字符串
     */
    @Test
    public void testString() {
        jedis.set("age", "18");
        System.out.println(jedis.get("age"));
    }
}
