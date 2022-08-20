public class Main {

    public static void main(String[] args) {

        CocheCRUD cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.delete();
        cocheCRUD.save();
        cocheCRUD.findAll();
    }
}


interface CocheCRUD {

    void save();

    void delete();

    void findAll();

}

class CocheCRUDImpl implements CocheCRUD {

    @Override
    public void save() {
        System.out.println("El metodo se llama save");
    }

    @Override
    public void delete() {
        System.out.println("El metodo se llama delete");
    }

    @Override
    public void findAll() {
        System.out.println("El metodo se llama findAll");
    }
}