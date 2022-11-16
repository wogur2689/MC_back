<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
    <html lang="ko">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.104.2">
        <title>Monthly Coding</title>

        <!-- css -->
        <link href="./assets/css/reset.css" rel="stylesheet">
        <link href="./assets/css/style.css" rel="stylesheet">

        <!-- js -->
        <script type="text/javascript" src="./common/common.js"></script>
    </head>
    <body>
    <div id="sidebar">
        <div class="sidebar_btn">
            <img id="main_logo" src="./img/icons/mc_favicon.svg" />
        </div>
        <div
                class="sidebar_btn"
                id="btn_home"
                style="cursor: pointer"
        >
            <img src="./img/icons/light_index.svg" />
        </div>
        <div
                class="sidebar_btn"
                id="btn_introduce"
                style="cursor: pointer"
        >
            <img src="./img/icons/dark_introduce.svg" />
        </div>
        <div
                class="sidebar_btn"
                id="btn_vision"
                style="cursor: pointer"
        >
            <img src="./img/icons/dark_shoeprints.svg" />
        </div>
        <div
                class="sidebar_btn"
                id="btn_plan"
                style="cursor: pointer"
        >
            <img src="./img/icons/dark_recruit.svg" />
        </div>
        <div
                class="sidebar_btn"
                id="btn_goal"
                style="cursor: pointer"
        >
            <img src="./img/icons/dark_headset.svg" />
        </div>
    </div>

    <main>
        <div class="tab_box" id="main_tab">
            <div class="tab" id="console_tab">
                <img src="./img/icons/mc_favicon.svg" />
                <span class="tab_name">Monthly_Coding.index</span>
                <img src="./img/icons/circle_green.svg" />
            </div>
        </div>

        <div id="main_content_box">
            <div id="content_box">
                <p id="content"></p>
            </div>
        </div>
    </main>
    </body>
</html>