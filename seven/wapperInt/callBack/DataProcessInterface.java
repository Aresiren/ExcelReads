package seven.wapperInt.callBack;



/**
 * [Github]https://github.com/MatrixSeven
 * [Bolg]https://matrixseven.github.io/
 * Created by seven on 2016/10/18.
 * �˴�����ÿһ�д���õ����ݡ���Ӧһ��ʵ��
 * TΪʵ��Bean����
 */
public interface DataProcessInterface<T>{
    /***
     * �˴�����ÿһ�д���õ����ݡ���Ӧһ��ʵ�壬
     * ��process������ɶ����Խ��д���ӹ�
     * @param t ʵ������
     */
    void process(T t);
}
