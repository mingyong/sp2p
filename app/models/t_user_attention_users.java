package models;

import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;

/**
 * 
 * @author lzp
 * @version 6.0
 * @created 2014-4-4 下午3:41:24
 */

@Entity
public class t_user_attention_users extends Model {

	public Long user_id;
	public Date time;
	public long attention_user_id;
	public String note_name;

	
	

}
