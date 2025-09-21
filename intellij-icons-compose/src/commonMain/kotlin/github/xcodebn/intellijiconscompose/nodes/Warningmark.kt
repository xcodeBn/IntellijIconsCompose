package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Warningmark: ImageVector
    get() {
        if (_Warningmark != null) return _Warningmark!!

        _Warningmark = ImageVector.Builder(
            name = "Warningmark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(12f, 14f)
                lineTo(12f, 15f)
                lineTo(11f, 15f)
                lineTo(11f, 14f)
                lineTo(12f, 14f)
                close()
                moveTo(12f, 10f)
                lineTo(12f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 10f)
                lineTo(12f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4AF3D))
            ) {
                moveTo(12f, 8f)
                lineTo(16f, 16f)
                lineTo(7f, 16f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(12f, 14f)
                    lineTo(12f, 15f)
                    lineTo(11f, 15f)
                    lineTo(11f, 14f)
                    lineTo(12f, 14f)
                    close()
                    moveTo(12f, 10f)
                    lineTo(12f, 13f)
                    lineTo(11f, 13f)
                    lineTo(11f, 10f)
                    lineTo(12f, 10f)
                    close()
                }
            }
        }.build()

        return _Warningmark!!
    }

private var _Warningmark: ImageVector? = null

