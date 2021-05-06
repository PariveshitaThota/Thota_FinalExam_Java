/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Pariveshita Thota
 */
public class ProgrammingLanguage implements LanguageInterface {
    // implementation of abstract method

    /**
     *
     * @param name
     */
  @Override
  public void getName(String name) {
    System.out.println("Programming Language: " + name);
  }
}

