public class AbstractFactory {

	public static void main(String[] args) {
		DatebaseUtil datebaseUtil = new DabaseUtilImp();
		IConnection connection = datebaseUtil.getConnection();
		ICommend commend = datebaseUtil.getCommend();
		connection.connect();
		commend.commend();
	}

}

//实现一个mysql的产品

/**
 * interface for create zcc %@#
 */
interface IConnection {
	void connect();
}

class MysqlConnection implements IConnection {

	@Override
	public void connect() {
		System.out.println("mysql connection sunccess at 127.0.0.1");
	}
}

interface ICommend {
	void commend();
}

class MysqlCommend implements ICommend {

	@Override
	public void commend() {
		System.out.println("mysql send the commend sunccss : show database");
	}
}

interface DatebaseUtil {
	IConnection getConnection();

	ICommend getCommend();
}

class DabaseUtilImp implements DatebaseUtil {
	@Override
	public IConnection getConnection() {
		return new MysqlConnection();
	}

	@Override
	public ICommend getCommend() {
		return new MysqlCommend();
	}
}

