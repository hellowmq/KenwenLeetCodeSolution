package com.wenmq.anno;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;

/**
 * @author ifans.wen
 * @date 2020/4/30
 * @description
 */
public class MsgProcessor extends AbstractProcessor {
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        Messager messager = processingEnv.getMessager();
//        for (Element element : roundEnvironment.getElementsAnnotatedWith(GetMsg.class)) {
//            PackageElement packageElement = (PackageElement) element
//                    .getEnclosingElement();
//            String packageName = packageElement.getQualifiedName().toString();
//            TypeElement classElement = (TypeElement) element;
//            String className = classElement.getSimpleName().toString();
//            String fullClassName = classElement.getQualifiedName().toString();
//            VariableElement variableElement = (VariableElement) element.getEnclosingElement();
//            String methodName = variableElement.getSimpleName().toString();
//            int id = classElement.getAnnotation(GetMsg.class).id();
//            String name = classElement.getAnnotation(GetMsg.class).name();
//            messager.printMessage(Diagnostic.Kind.NOTE,
//                    "Annotation class : packageName = " + packageName);
//            messager.printMessage(Diagnostic.Kind.NOTE,
//                    "Annotation class : className = " + className);
//            messager.printMessage(Diagnostic.Kind.NOTE,
//                    "Annotation class : fullClassName = " + fullClassName);
//            messager.printMessage(Diagnostic.Kind.NOTE,
//                    "Annotation class : methodName = " + methodName);
//            messager.printMessage(Diagnostic.Kind.NOTE,
//                    "Annotation class : id = " + id + "  name = " + name);
//        }
        return true;
    }
//
//    @Override
//    public SourceVersion getSupportedSourceVersion() {
//        return SourceVersion.RELEASE_8;
//    }


//    @Override
//    public Set<String> getSupportedAnnotationTypes() {
//        Set<String> annotations = new LinkedHashSet<>();
//        annotations.add("*");
//        return annotations;
//
//    }
}
