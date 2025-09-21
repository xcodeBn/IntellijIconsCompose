package github.xcodebn.intellijiconscompose.nodes.jsf

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Renderer: ImageVector
    get() {
        if (_Renderer != null) return _Renderer!!

        _Renderer = ImageVector.Builder(
            name = "Renderer",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(15f, 4f)
                curveTo(15.12f, 3.92f, 15.12f, 3.06f, 14.80f, 2.74f)
                lineTo(13f, 1f)
                curveTo(12.98f, 0.92f, 12.12f, 0.92f, 11.80f, 1.24f)
                lineTo(10f, 3f)
                lineTo(13f, 6f)
                lineTo(15f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(12f, 7f)
                lineTo(9f, 4f)
                lineTo(2f, 11f)
                lineTo(2f, 14f)
                lineTo(5f, 14f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(15f, 4f)
                    curveTo(15.12f, 3.92f, 15.12f, 3.06f, 14.80f, 2.74f)
                    lineTo(13f, 1f)
                    curveTo(12.98f, 0.92f, 12.12f, 0.92f, 11.80f, 1.24f)
                    lineTo(10f, 3f)
                    lineTo(13f, 6f)
                    lineTo(15f, 4f)
                    close()
                }
            }
        }.build()

        return _Renderer!!
    }

private var _Renderer: ImageVector? = null

