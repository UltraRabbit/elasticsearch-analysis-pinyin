package org.elasticsearch.index.analysis;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;

/**
 */
public class PinyinAnalyzerProvider extends AbstractIndexAnalyzerProvider<PinyinAnalyzer> {

    private final PinyinAnalyzer analyzer;

    @Inject
    public PinyinAnalyzerProvider(Index index, @IndexSettings Settings indexSettings, Environment env, @Assisted String name, @Assisted Settings settings) {
        super(index, indexSettings, name, settings);
        analyzer = new PinyinAnalyzer(settings);
    }

    @Override
    public PinyinAnalyzer get() {
        return this.analyzer;
    }
}
