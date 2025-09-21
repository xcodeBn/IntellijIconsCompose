package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Clickhouse: ImageVector
    get() {
        if (_Clickhouse != null) return _Clickhouse!!

        _Clickhouse = ImageVector.Builder(
            name = "Clickhouse",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFCC00))
            ) {
                moveTo(1f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 1f)
                lineTo(1f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFCC00))
            ) {
                moveTo(4f, 15f)
                lineTo(6f, 15f)
                lineTo(6f, 1f)
                lineTo(4f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFCC00))
            ) {
                moveTo(7f, 15f)
                lineTo(9f, 15f)
                lineTo(9f, 1f)
                lineTo(7f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFCC00))
            ) {
                moveTo(10f, 15f)
                lineTo(12f, 15f)
                lineTo(12f, 1f)
                lineTo(10f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFFCC00))
            ) {
                moveTo(13f, 9f)
                lineTo(15f, 9f)
                lineTo(15f, 6f)
                lineTo(13f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFFF0000))
            ) {
                moveTo(1f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 12f)
                lineTo(1f, 12f)
                close()
            }
        }.build()

        return _Clickhouse!!
    }

private var _Clickhouse: ImageVector? = null

