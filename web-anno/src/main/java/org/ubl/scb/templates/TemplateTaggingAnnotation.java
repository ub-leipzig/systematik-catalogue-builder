/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ubl.scb.templates;

import static org.ubl.scb.vocabulary.ANNO.Annotation;
import static org.ubl.scb.vocabulary.ANNO.tagging;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

/**
 * TemplateTaggingAnnotation.
 *
 * @author christopher-johnson
 */
@JsonPropertyOrder({"@context", "id", "type", "motivation", "body", "target"})
public class TemplateTaggingAnnotation {

    @JsonProperty("@context")
    private List<String> context;

    @JsonProperty("id")
    private String id;

    @JsonProperty("type")
    private String type = Annotation.getIRIString();

    @JsonProperty
    private String motivation = tagging.getIRIString();

    @JsonProperty
    private TemplateTagBody body;

    @JsonProperty
    private String target;

    @JsonProperty
    private int group;

    /**
     * setContext.
     *
     * @param context a {@link List} of contexts
     */
    public void setContext(final List<String> context) {
        this.context = context;
    }

    /**
     * setId.
     *
     * @param id id
     */
    public void setAnnoId(final String id) {
        this.id = id;
    }

    /**
     * getAnnoId.
     *
     * @return id
     */
    @JsonIgnore
    public String getAnnoId() {
        return this.id;
    }

    /**
     * setBody.
     *
     * @param body body
     */
    public void setBody(final TemplateTagBody body) {
        this.body = body;
    }

    /**
     * getBody.
     *
     * @return TemplateBody
     */
    @JsonIgnore
    public TemplateTagBody getBody() {
        return this.body;
    }

    /**
     * setTarget.
     *
     * @param target target
     */
    public void setTarget(final String target) {
        this.target = target;
    }

    /**
     * getTargetGroup.
     *
     * @return group
     */
    @JsonIgnore
    public int getTargetGroup() {
        return this.group;
    }

    /**
     * setTargetGroup.
     *
     * @param group group
     */
    public void setTargetGroup(final int group) {
        this.group = group;
    }

}
