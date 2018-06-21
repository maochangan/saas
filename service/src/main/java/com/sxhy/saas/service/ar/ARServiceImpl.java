package com.sxhy.saas.service.ar;

import com.sxhy.saas.entity.arbean.*;
import com.sxhy.saas.repo.arrepo.ARMapperDao;
import com.sxhy.saas.util.ConstantInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ARServiceImpl implements ARService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ARMapperDao companyUserDao;

    @Override
    public List<ArThemeManagement> getAllARTheme() {
        List<ArThemeManagement> list = companyUserDao.selectAll();
        if (ConstantInterface.NO_DATA_INSERT_NUM == list.size()) {
            return null;
        } else {
            return list;
        }
    }

    @Override
    public boolean updateArTheme(ArThemeManagement arThemeManagement) {
        Integer state = companyUserDao.updateArThemeSerByParKey(arThemeManagement);
        return state != 0;
    }

    @Override
    public boolean addARTheme(ArThemeManagement arThemeManagement) {
        Integer state = companyUserDao.addARTheme(arThemeManagement);
        return state != 0;
    }

    @Override
    public ArThemeManagement getARThemeById(Integer id) {
        ArThemeManagement arThemeManagement = companyUserDao.getARThemeById(id);
        if (null == arThemeManagement) {
            return null;
        } else {
            return arThemeManagement;
        }
    }

    @Override
    public boolean addARChart(ArCharManagement arCharManagement) {
        Integer state = companyUserDao.addARChart(arCharManagement);
        return 0 != state;
    }

    @Override
    public List<ArCharManagement> getAllARChart() {
        List<ArCharManagement> list = companyUserDao.getAllARChart();
        if (list.size() == ConstantInterface.NO_DATA_INSERT_NUM) {
            return null;
        } else {
            return list;
        }
    }

    @Override
    public boolean updateARTarget(ArCharManagement arCharManagement) {
        Integer result = companyUserDao.updateARTarget(arCharManagement);
        return result != 0;
    }

    @Override
    public void removeTarget(String targetId) {
        Integer result = companyUserDao.removeTarget(targetId);
        logger.info("code" + result);
    }

    @Override
    public boolean addARModel(ArModelManagement arModelManagement) {
        Integer result = companyUserDao.addARModel(arModelManagement);
        return result != 0;
    }

    @Override
    public List<ArModelManagement> getARModelList() {
        List<ArModelManagement> result = companyUserDao.getARModleList();
        if (0 == result.size()) {
            return null;
        } else {
            return result;
        }
    }

    @Override
    public ArModelManagement getARModel(Integer id) {
        ArModelManagement arModelManagement = companyUserDao.getARModel(id);
        return arModelManagement;
    }

    @Override
    public boolean removeARModel(Integer id) {
        Integer result = companyUserDao.removeARModel(id);
        return result != 0;
    }

    @Override
    public boolean updateARModel(ArModelManagement arModel) {
        Integer result = companyUserDao.updateArModelSerByParKey(arModel);
        return result != 0;
    }

    @Override
    public ArCharManagement getARChartByTargetId(String targetId) {
        ArCharManagement arCharManagement = companyUserDao.getARTargetByImageId(targetId);
        return arCharManagement;
    }

    @Override
    public boolean deleteARThemeById(Integer id) {
        Integer result = companyUserDao.deleteARThemeById(id);
        return result != 0;
    }

    @Override
    public Integer getCountImageNum(Integer id) {
        Integer num = companyUserDao.getCountImageNum(id);
        return num;
    }

    @Override
    public boolean addFile(FileTable fileTable) {
        Integer result = companyUserDao.addFile(fileTable);
        return result != 0;
    }

    @Override
    public List<FileTable> getFileList(String fileType) {
        List<FileTable> list = companyUserDao.getFileList(fileType);
        if (0 == list.size()) {
            return null;
        } else {
            return list;
        }
    }

    @Override
    public boolean deleteFile(Integer id) {
        Integer result = companyUserDao.deleteFile(id);
        return result != 0;
    }

    @Override
    public FileTable selectFileById(Integer id) {
        FileTable fileTable = companyUserDao.selectFileById(id);
        return fileTable;
    }



}
