"use client";

import { useEffect, useState } from "react";

export default function Home() {
  const [lang, setLang] = useState("kr");
  const [msg, setMsg] = useState("");

  useEffect(() => {
    if (!lang) return;

    fetch(`http://192.168.20.144:9090/greeting?lang=${lang}`)
      .then((res) => res.text())
      .then((text) => setMsg(text))
      .catch(() => setMsg("인사말 오류"));
  }, [lang]);

  return (
    <>
      <div>인사말</div>
      <label>언어선택</label>
      <select value={lang} onChange={() => setLang(lang)}>
        <option>kr</option>
        <option>en</option>
        <option>jp</option>
      </select>
      <div>결과:{msg}</div>
    </>
  );
}
