package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class EncryptThisTest {


  @ParameterizedTest(name = "[{index}] expected = {0}; input = {1}")
  @CsvFileSource(resources = "test.csv")
  @DisplayName("Check encryption")
  void encryptThis(String expected, String input) {

    String actual = EncryptThis.encryptThis(input);
    assertEquals(expected, actual);
  }
}