package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Processmark: ImageVector
    get() {
        if (_Processmark != null) return _Processmark!!

        _Processmark = ImageVector.Builder(
            name = "Processmark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(12f, 10f)
                lineTo(15f, 12f)
                lineTo(12f, 14f)
                lineTo(12f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(12f, 10f)
                    lineTo(15f, 12f)
                    lineTo(12f, 14f)
                    lineTo(12f, 13f)
                    lineTo(10f, 13f)
                    lineTo(10f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 10f)
                    close()
                }
            }
        }.build()

        return _Processmark!!
    }

private var _Processmark: ImageVector? = null

