public static Digester newDigester(boolean xmlValidation,
                                   boolean xmlNamespaceAware,
                                   RuleSet rule) {
  Digester digester = new Digester();
  // ...
  digester.setUseContextClassLoader(true);
  // ...
  return digester;
}
