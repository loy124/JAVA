package generic;

public class GenericPrinter<T extends Meterial>  {

    //외부에서도 제너릭메서드가 사용하지만 메서드 내에서만 유효하다( 지역변수같은 개념 )
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing(){
        material.doPrinting();
    }

}
