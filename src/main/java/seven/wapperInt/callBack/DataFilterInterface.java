package seven.wapperInt.callBack;

/**
 * [Github]https://github.com/MatrixSeven
 * [Bolg]https://matrixseven.github.io/
 * Created by seven on 2016/10/18.
 * ��Ҫ��װ�����ݽ��й��ˣ���Ӧʵ��Bean���������false��������������
 * TΪʵ��Bean����
 */
@FunctionalInterface
public interface DataFilterInterface<T> {
    /**
     * ��Ҫ��װ�����ݽ��й��ˣ���Ӧʵ��Bean\n
     * �������false��������������
     * @param t ʵ��Bean����
     * @return
     */
    Boolean filter(T t);
}
