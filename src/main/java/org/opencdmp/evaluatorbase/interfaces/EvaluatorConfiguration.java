package org.opencdmp.evaluatorbase.interfaces;

import org.opencdmp.commonmodels.enums.PluginEntityType;
import org.opencdmp.commonmodels.models.ConfigurationField;
import org.opencdmp.evaluatorbase.models.misc.RankConfig;

import java.util.List;

public class EvaluatorConfiguration {
    private String evaluatorId;
    private RankConfig rankConfig;
    private List<PluginEntityType> evaluatorEntityTypes;
    private boolean useSharedStorage;
    private boolean hasLogo;
    private List<ConfigurationField> configurationFields;
    private List<ConfigurationField> userConfigurationFields;
    private List<BenchmarkConfiguration> availableBenchmarks;

    public String getEvaluatorId() {
        return evaluatorId;
    }

    public void setEvaluatorId(String evaluatorId) {
        this.evaluatorId = evaluatorId;
    }

    public RankConfig getRankConfig() {
        return rankConfig;
    }

    public void setRankConfig(RankConfig rankConfig) {
        this.rankConfig = rankConfig;
    }

    public List<PluginEntityType> getEvaluatorEntityTypes() {
        return evaluatorEntityTypes;
    }

    public void setEvaluatorEntityTypes(List<PluginEntityType> evaluatorEntityTypes) {
        this.evaluatorEntityTypes = evaluatorEntityTypes;
    }

    public boolean isUseSharedStorage() {
        return useSharedStorage;
    }

    public void setUseSharedStorage(boolean useSharedStorage) {
        this.useSharedStorage = useSharedStorage;
    }

    public boolean isHasLogo() {
        return hasLogo;
    }

    public void setHasLogo(boolean hasLogo) {
        this.hasLogo = hasLogo;
    }

    public List<ConfigurationField> getConfigurationFields() {
        return configurationFields;
    }

    public void setConfigurationFields(List<ConfigurationField> configurationFields) {
        this.configurationFields = configurationFields;
    }

    public List<ConfigurationField> getUserConfigurationFields() {
        return userConfigurationFields;
    }

    public void setUserConfigurationFields(List<ConfigurationField> userConfigurationFields) {
        this.userConfigurationFields = userConfigurationFields;
    }

    public List<BenchmarkConfiguration> getAvailableBenchmarks() {
        return availableBenchmarks;
    }

    public void setAvailableBenchmarks(List<BenchmarkConfiguration> availableBenchmarks) {
        this.availableBenchmarks = availableBenchmarks;
    }
}
