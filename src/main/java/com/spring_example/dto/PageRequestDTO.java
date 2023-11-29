package com.spring_example.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequestDTO {

    @Builder.Default
    private int page = 1;

    @Builder.Default
    private int size = 10;

    private String type; // 검색의 종류 t,c, w, tc,tw, twc

    private String keyword;

    private String link;

    public String[] getTypes() { // 검색조건을 BoardRepository에서 String[]로 처리하므로 검색조건 문자열로 반환하는 함수
        if (type == null || type.isEmpty()) {
            return null;
        }
        return type.split("");
    }

    public Pageable getPageable(String... props) {
        return PageRequest.of(this.page - 1, this.size, Sort.by(props).descending());
    }


    public String getLink() {

        if (link == null) {
            StringBuilder builder = new StringBuilder();

            builder.append("page=").append(this.page);

            builder.append("&size=").append(this.size);


            if (type != null && type.length() > 0) {
                builder.append("&type=").append(type);
            }

            if (keyword != null) {

                builder.append("&keyword=")
                        .append(URLEncoder.encode(keyword, StandardCharsets.UTF_8));
            }
                link = builder.toString();
            }
            return link;
        }
    }
