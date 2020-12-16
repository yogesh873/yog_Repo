/*
 * package ingov.itd.iec.cpc.serviceimpl;
 * 
 * import java.io.BufferedReader; import java.io.File; import
 * java.io.FileInputStream; import java.io.FileOutputStream; import
 * java.io.IOException; import java.io.InputStream; import
 * java.io.InputStreamReader; import java.math.BigInteger; import
 * java.util.Properties;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.core.io.Resource; import
 * org.springframework.scheduling.annotation.EnableScheduling; import
 * org.springframework.scheduling.annotation.Scheduled; import
 * org.springframework.stereotype.Service; import
 * org.springframework.util.ResourceUtils;
 * 
 * import ingov.itd.iec.cpc.api.service.SchedulerService; import
 * ingov.itd.iec.cpc.dao.TdsCountDao; import
 * ingov.itd.iec.cpc.dao.TdsPgCountdao;
 * 
 * 
 * @Service
 * 
 * @EnableScheduling
 * 
 * public class SchedulerServiceimpl implements SchedulerService {
 * 
 * static File outputfile = new File("classpath:data/Out.properties");
 * 
 * @Value("classpath:data/LastReadValue.properties") Resource resourceFile;
 * 
 * @Autowired TdsCountDao tdsCountDao;
 * 
 * @Autowired TdsPgCountdao tdsPgCountDao;
 * 
 * 
 * @Scheduled(fixedDelay = 5000) public void getCounts() { try { File file =
 * ResourceUtils.getFile("classpath:LastReadValue.properties"); InputStream in =
 * new FileInputStream(file);
 * 
 * 
 * Properties props = new Properties(); props.load(in);
 * 
 * BigInteger minoutid
 * =BigInteger.valueOf(Long.valueOf(props.getProperty("Minid"))); BigInteger
 * maxoutid = BigInteger.valueOf(Long.valueOf(props.getProperty("maxid")));
 * 
 * if(minoutid.longValue() < 0) minoutid = tdsCountDao.getMinOutId();
 * if(maxoutid.longValueExact() > minoutid.longValueExact() ) minoutid =
 * maxoutid;
 * 
 * maxoutid = tdsCountDao.getMaxOutId();
 * 
 * System.out.println(maxoutid); //get the stg count long stgcnt =
 * tdsCountDao.getStgCount(minoutid, maxoutid, 2020);
 * System.out.println("stgcount ="+stgcnt); //get the all count long tdsallcnt =
 * tdsPgCountDao.getTdsAllCount(minoutid, maxoutid, 2020);
 * System.out.println("tdsallcnt ="+tdsallcnt); //update the properties
 * props.setProperty("Minid", String.valueOf(minoutid));
 * props.setProperty("maxid", String.valueOf(maxoutid));
 * 
 * props.store(new FileOutputStream(file), "Saved at systime");
 * 
 * } catch (IOException e) {
 * 
 * e.printStackTrace(); } }
 * 
 * 
 * 
 * }
 */