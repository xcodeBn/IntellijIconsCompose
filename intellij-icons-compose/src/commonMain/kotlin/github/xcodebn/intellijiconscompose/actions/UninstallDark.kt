package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UninstallDark: ImageVector
    get() {
        if (_UninstallDark != null) return _UninstallDark!!

        _UninstallDark = ImageVector.Builder(
            name = "UninstallDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(2f, 11f)
                lineTo(14f, 11f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 11f)
                close()
                moveTo(12f, 12f)
                lineTo(12f, 13f)
                lineTo(13f, 13f)
                lineTo(13f, 12f)
                lineTo(12f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC75450))
            ) {
                moveTo(9f, 6f)
                lineTo(12f, 6f)
                lineTo(8f, 10f)
                lineTo(4f, 6f)
                lineTo(7f, 6f)
                lineTo(7f, 1f)
                lineTo(9f, 1f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(2f, 11f)
                    lineTo(14f, 11f)
                    lineTo(14f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 11f)
                    close()
                    moveTo(12f, 12f)
                    lineTo(12f, 13f)
                    lineTo(13f, 13f)
                    lineTo(13f, 12f)
                    lineTo(12f, 12f)
                    close()
                }
            }
        }.build()

        return _UninstallDark!!
    }

private var _UninstallDark: ImageVector? = null

