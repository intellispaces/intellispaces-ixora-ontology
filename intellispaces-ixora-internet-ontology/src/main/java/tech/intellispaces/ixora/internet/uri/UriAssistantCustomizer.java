package tech.intellispaces.ixora.internet.uri;

import tech.intellispaces.reflections.framework.annotation.AssistantCustomizer;

@AssistantCustomizer(UriDomain.class)
public interface UriAssistantCustomizer {

  Uri create(String string);
}
