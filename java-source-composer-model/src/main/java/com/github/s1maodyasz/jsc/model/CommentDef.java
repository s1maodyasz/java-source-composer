package com.github.s1maodyasz.jsc.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface CommentDef extends Def {

    final class Inline implements CommentDef {
        private final String text;

        public Inline(String text) {
            this.text = text;
        }

        public String text() {
            return text;
        }
    }

    final class Multiline implements CommentDef {
        private final List<String> lines;

        public Multiline(List<String> lines) {
            this.lines = lines;
        }

        public List<String> lines() {
            return lines;
        }
    }

    final class JavaDoc implements CommentDef {
        private final List<String> lines;
        private final Map<JavaDocTag, String> tags;

        public JavaDoc() {
            this.lines = new ArrayList<>();
            this.tags = new LinkedHashMap<>();
        }

        public List<String> lines() {
            return lines;
        }

        public Map<JavaDocTag, String> tags() {
            return tags;
        }
    }
}
