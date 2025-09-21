package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Modulegroup: ImageVector
    get() {
        if (_Modulegroup != null) return _Modulegroup!!

        _Modulegroup = ImageVector.Builder(
            name = "Modulegroup",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(8f, 4f)
                lineTo(7f, 3f)
                curveTo(6.30f, 2.32f, 5.53f, 2.00f, 4.98f, 2.00f)
                lineTo(1f, 2f)
                curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                lineTo(1f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 8f)
                lineTo(15f, 8f)
                lineTo(15f, 4f)
                lineTo(8f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(13f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 13f)
                lineTo(13f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(13f, 12f)
                lineTo(16f, 12f)
                lineTo(16f, 9f)
                lineTo(13f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(9f, 16f)
                lineTo(12f, 16f)
                lineTo(12f, 13f)
                lineTo(9f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(9f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 9f)
                lineTo(9f, 9f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(8f, 4f)
                    lineTo(7f, 3f)
                    curveTo(6.30f, 2.32f, 5.53f, 2.00f, 4.98f, 2.00f)
                    lineTo(1f, 2f)
                    curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                    lineTo(1f, 13f)
                    lineTo(8f, 13f)
                    lineTo(8f, 8f)
                    lineTo(15f, 8f)
                    lineTo(15f, 4f)
                    lineTo(8f, 4f)
                    close()
                }
            }
        }.build()

        return _Modulegroup!!
    }

private var _Modulegroup: ImageVector? = null

