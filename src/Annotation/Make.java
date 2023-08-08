package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Membuat Annotation
@Target({ElementType.TYPE})//Memberi Annotation untuk bisa digunakan dimana(class, method, dkk)
@Retention(RetentionPolicy.RUNTIME)//Memberitahu Annotation apakah disimpan di hasil kompilasi & bisa dibaca oleh reflection

public @interface Make {

    String Sapa();
    String Name();

}
