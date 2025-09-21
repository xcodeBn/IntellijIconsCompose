package github.xcodebn.intellijiconscompose.providers

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Teradata: ImageVector
    get() {
        if (_Teradata != null) return _Teradata!!

        _Teradata = ImageVector.Builder(
            name = "Teradata",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(4f, 6f)
                lineTo(4f, 4f)
                lineTo(12f, 4f)
                lineTo(12f, 6f)
                lineTo(9f, 6f)
                lineTo(9f, 13f)
                curveTo(7.68f, 13.01f, 7.00f, 12.36f, 7.00f, 11.03f)
                lineTo(7f, 6f)
                lineTo(4f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(4f, 6f)
                    lineTo(4f, 4f)
                    lineTo(12f, 4f)
                    lineTo(12f, 6f)
                    lineTo(9f, 6f)
                    lineTo(9f, 13f)
                    curveTo(7.68f, 13.01f, 7.00f, 12.36f, 7.00f, 11.03f)
                    lineTo(7f, 6f)
                    lineTo(4f, 6f)
                    close()
                }
            }
        }.build()

        return _Teradata!!
    }

private var _Teradata: ImageVector? = null

