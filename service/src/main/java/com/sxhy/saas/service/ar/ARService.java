package com.sxhy.saas.service.ar;

import com.sxhy.saas.entity.arbean.*;

import java.util.List;

public interface ARService {

    List<ArThemeManagement> getAllARTheme();

    boolean updateArTheme(ArThemeManagement arThemeManagement);

    boolean addARTheme(ArThemeManagement arThemeManagement);

    ArThemeManagement getARThemeById(Integer id);

    boolean addARChart(ArCharManagement arCharManagement);

    List<ArCharManagement> getAllARChart();

    boolean updateARTarget(ArCharManagement arCharManagement);

    void removeTarget(String targetId);

    boolean addARModel(ArModelManagement arModelManagement);

    List<ArModelManagement> getARModelList();

    ArModelManagement getARModel(Integer id);

    boolean removeARModel(Integer id);

    boolean updateARModel(ArModelManagement arModel);

    ArCharManagement getARChartByTargetId(String targetId);

    boolean deleteARThemeById(Integer id);

    Integer getCountImageNum(Integer id);

    boolean addFile(FileTable fileTable);

    List<FileTable> getFileList(String fileType);

    boolean deleteFile(Integer id);

    FileTable selectFileById(Integer id);

}
