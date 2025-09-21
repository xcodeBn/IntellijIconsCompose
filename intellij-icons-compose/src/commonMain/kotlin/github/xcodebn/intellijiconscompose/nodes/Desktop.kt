package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Desktop: ImageVector
    get() {
        if (_Desktop != null) return _Desktop!!

        _Desktop = ImageVector.Builder(
            name = "Desktop",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(12f, 0f)
                lineTo(12f, 8f)
                lineTo(0f, 8f)
                lineTo(0f, 0f)
                close()
                moveTo(2f, 2f)
                lineTo(2f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 2f)
                lineTo(2f, 2f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 8f)
                    lineTo(0f, 8f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(2f, 2f)
                    lineTo(2f, 6f)
                    lineTo(10f, 6f)
                    lineTo(10f, 2f)
                    lineTo(2f, 2f)
                    close()
                }
            }
        }.build()

        return _Desktop!!
    }

private var _Desktop: ImageVector? = null

