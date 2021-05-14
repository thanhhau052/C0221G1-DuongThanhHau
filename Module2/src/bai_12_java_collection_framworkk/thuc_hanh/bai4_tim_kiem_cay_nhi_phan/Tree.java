package bai_12_java_collection_framworkk.thuc_hanh.bai4_tim_kiem_cay_nhi_phan;

public interface Tree<E> {
  public  boolean insert(E e);
  public  void inorder();
  public  int getSize();
}
