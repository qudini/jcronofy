package org.biacode.jcronofy.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

/**
 * User: Arthur Asatryan
 * Date: 10/5/16
 * Time: 5:25 PM
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OptionModel implements Serializable {
    private static final long serialVersionUID = 6026409532629893278L;

    //region Properties
    @JsonProperty("delete")
    private boolean delete;

    @JsonProperty("update")
    private boolean update;

    @JsonProperty("change_participation_status")
    private boolean changeParticipationStatus;
    //endregion

    //region Constructors
    public OptionModel() {
    }

    public OptionModel(final boolean delete, final boolean update, final boolean changeParticipationStatus) {
        this.delete = delete;
        this.update = update;
        this.changeParticipationStatus = changeParticipationStatus;
    }
    //endregion

    //region Equals, HashCode and ToString
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OptionModel)) {
            return false;
        }
        final OptionModel that = (OptionModel) o;
        return new EqualsBuilder()
                .append(delete, that.delete)
                .append(update, that.update)
                .append(changeParticipationStatus, that.changeParticipationStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(delete)
                .append(update)
                .append(changeParticipationStatus)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .appendSuper(super.toString())
                .append("delete", delete)
                .append("update", update)
                .append("changeParticipationStatus", changeParticipationStatus)
                .toString();
    }
    //endregion

    //region Properties getters and setters
    public boolean isDelete() {
        return delete;
    }

    public void setDelete(final boolean delete) {
        this.delete = delete;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(final boolean update) {
        this.update = update;
    }

    public boolean isChangeParticipationStatus() {
        return changeParticipationStatus;
    }

    public void setChangeParticipationStatus(final boolean changeParticipationStatus) {
        this.changeParticipationStatus = changeParticipationStatus;
    }
    //endregion
}
