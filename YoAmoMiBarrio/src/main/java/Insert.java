
import ar.com.yoamomibarrio.dao.HibernateUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Insert implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Thread t = new Thread(new Insert());
        t.start();

    }

    ;
    
       

    @Override
    public void run() {

        StringBuilder insert = new StringBuilder("insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABADA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABAJAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABAJOR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABALAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABALEO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABANAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABANTO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABARCA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABARSE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABASTO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABATIR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABAZN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABEDUL');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABEJAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABEJN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABENUZ');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABESN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABETAL');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABETAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABIETE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABIGEO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABINAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABIPN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABISAL');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABISMO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABITAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABITN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABLANO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABOBAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABOBRA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABOCAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABOFAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABOGAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABOLIR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABONAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABONDO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABORDO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABORSO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABORTO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABOYAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABRAZO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABREGO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABRIGO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABROJO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABROMA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABRUZA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABRUZO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'BSIDA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'BSIDE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABUELA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABUELO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABULIA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABUNDO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABURAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABUSAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABUSN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ABUZAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACABAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACACIA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACALIA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACAMAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACAMPO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACANTO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACARAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACATAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACATES');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACAULE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACAYAZ');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACCESO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACCIN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEBAL');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACECHE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACECHO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEDAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEDIA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEIFA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEITE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACELGA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACENIA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACENTO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEPAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEPTA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEPTO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACERAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACERBA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACERBO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACERCA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACERA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACERVO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACETAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACETN');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACETRE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACEZAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACHIRA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACHOTE');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACHURA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACIAGA');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACIAGO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACIANO');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACBAR');\n"
                + "insert into palabra_clave_a (id_palabra,descripcion) values (date_format(sysdate(),'%y%m%d%H%i%s'),'ACICHE');\n"
                + "");

        try {
            for (String s : insert.toString().split(";")) {
                Session sesion = HibernateUtil.getSessionFactory().openSession();
                Transaction tx = sesion.beginTransaction();
                sesion.createSQLQuery(s).executeUpdate();
                tx.commit();
                sesion.close();

                System.out.println("Insertado: " + s);
                try {
                    Thread.sleep(1001);
                } catch (InterruptedException ex) {

                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
