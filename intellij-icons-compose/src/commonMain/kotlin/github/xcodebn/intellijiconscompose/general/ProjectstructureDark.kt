package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProjectstructureDark: ImageVector
    get() {
        if (_ProjectstructureDark != null) return _ProjectstructureDark!!

        _ProjectstructureDark = ImageVector.Builder(
            name = "ProjectstructureDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(14f, 8f)
                lineTo(14f, 10f)
                lineTo(10f, 10f)
                lineTo(0f, 10f)
                lineTo(0f, 2f)
                lineTo(0f, 0f)
                lineTo(5f, 0f)
                lineTo(7f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 10f)
                lineTo(10f, 10f)
                lineTo(6f, 10f)
                lineTo(6f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 4f)
                lineTo(14f, 4f)
                lineTo(14f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(14f, 8f)
                    lineTo(14f, 10f)
                    lineTo(10f, 10f)
                    lineTo(0f, 10f)
                    lineTo(0f, 2f)
                    lineTo(0f, 0f)
                    lineTo(5f, 0f)
                    lineTo(7f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 10f)
                    lineTo(10f, 10f)
                    lineTo(6f, 10f)
                    lineTo(6f, 8f)
                    lineTo(10f, 8f)
                    lineTo(10f, 4f)
                    lineTo(14f, 4f)
                    lineTo(14f, 8f)
                    close()
                }
            }
        }.build()

        return _ProjectstructureDark!!
    }

private var _ProjectstructureDark: ImageVector? = null

