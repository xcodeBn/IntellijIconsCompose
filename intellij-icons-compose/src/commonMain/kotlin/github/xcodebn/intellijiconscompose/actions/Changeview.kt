package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Changeview: ImageVector
    get() {
        if (_Changeview != null) return _Changeview!!

        _Changeview = ImageVector.Builder(
            name = "Changeview",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8f)
                lineTo(6f, 10f)
                lineTo(7f, 11f)
                lineTo(10f, 8f)
                lineTo(10f, 8f)
                lineTo(10f, 8f)
                lineTo(7f, 5f)
                lineTo(6f, 7f)
                lineTo(8f, 8f)
                close()
                moveTo(4f, 4f)
                lineTo(14f, 4f)
                lineTo(14f, 13f)
                lineTo(4f, 13f)
                lineTo(4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 0f)
                lineTo(10f, 0f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8f, 8f)
                    lineTo(6f, 10f)
                    lineTo(7f, 11f)
                    lineTo(10f, 8f)
                    lineTo(10f, 8f)
                    lineTo(10f, 8f)
                    lineTo(7f, 5f)
                    lineTo(6f, 7f)
                    lineTo(8f, 8f)
                    close()
                    moveTo(4f, 4f)
                    lineTo(14f, 4f)
                    lineTo(14f, 13f)
                    lineTo(4f, 13f)
                    lineTo(4f, 4f)
                    close()
                }
            }
        }.build()

        return _Changeview!!
    }

private var _Changeview: ImageVector? = null

