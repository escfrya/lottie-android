package com.airbnb.lottie.animation.content;

import java.util.List;
import com.airbnb.lottie.model.content.ContentModel;

public interface Content {
  String getName();

  void setContents(List<Content> contentsBefore, List<Content> contentsAfter);
  void setVisible(boolean visible);
}
