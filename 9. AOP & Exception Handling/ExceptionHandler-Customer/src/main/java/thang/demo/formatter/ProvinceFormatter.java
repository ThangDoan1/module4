package thang.demo.formatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import thang.demo.model.entity.Province;
import thang.demo.service.ProvinceService;

import java.text.ParseException;
import java.util.Locale;

public class ProvinceFormatter implements Formatter<Province> {
    private ProvinceService provinceService;

    @Autowired
    public ProvinceFormatter(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }

    @Override
    public Province parse(String text, Locale locale) throws ParseException {
        return provinceService.findOne(Long.valueOf(text));
    }

    @Override
    public String print(Province object, Locale locale) {
        return object.toString();
    }
}
