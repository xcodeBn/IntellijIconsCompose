package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Hidepassed: ImageVector
    get() {
        if (_Hidepassed != null) return _Hidepassed!!

        _Hidepassed = ImageVector.Builder(
            name = "Hidepassed",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 9f)
                lineTo(9f, 13f)
                lineTo(7f, 13f)
                lineTo(7f, 9f)
                lineTo(3f, 6f)
                lineTo(3f, 5f)
                lineTo(13f, 5f)
                lineTo(13f, 6f)
                lineTo(9f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 9f)
                    lineTo(9f, 13f)
                    lineTo(7f, 13f)
                    lineTo(7f, 9f)
                    lineTo(3f, 6f)
                    lineTo(3f, 5f)
                    lineTo(13f, 5f)
                    lineTo(13f, 6f)
                    lineTo(9f, 9f)
                    close()
                }
            }
        }.build()

        return _Hidepassed!!
    }

private var _Hidepassed: ImageVector? = null

