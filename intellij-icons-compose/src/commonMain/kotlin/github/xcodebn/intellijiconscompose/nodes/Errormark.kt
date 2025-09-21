package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Errormark: ImageVector
    get() {
        if (_Errormark != null) return _Errormark!!

        _Errormark = ImageVector.Builder(
            name = "Errormark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFE05555))
            ) {
                moveTo(16f, 12f)
                curveTo(16.00f, 14.43f, 14.43f, 16.00f, 12.50f, 16.00f)
                curveTo(10.57f, 16.00f, 9.00f, 14.43f, 9.00f, 12.50f)
                curveTo(9.00f, 10.57f, 10.57f, 9.00f, 12.50f, 9.00f)
                curveTo(14.43f, 9.00f, 16.00f, 10.57f, 16.00f, 12.50f)
            }
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(13f, 14f)
                lineTo(13f, 15f)
                lineTo(12f, 15f)
                lineTo(12f, 14f)
                lineTo(13f, 14f)
                close()
                moveTo(13f, 10f)
                lineTo(13f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 10f)
                lineTo(13f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFE05555))
                ) {
                    moveTo(16f, 12f)
                    curveTo(16.00f, 14.43f, 14.43f, 16.00f, 12.50f, 16.00f)
                    curveTo(10.57f, 16.00f, 9.00f, 14.43f, 9.00f, 12.50f)
                    curveTo(9.00f, 10.57f, 10.57f, 9.00f, 12.50f, 9.00f)
                    curveTo(14.43f, 9.00f, 16.00f, 10.57f, 16.00f, 12.50f)
                }
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(13f, 14f)
                    lineTo(13f, 15f)
                    lineTo(12f, 15f)
                    lineTo(12f, 14f)
                    lineTo(13f, 14f)
                    close()
                    moveTo(13f, 10f)
                    lineTo(13f, 13f)
                    lineTo(12f, 13f)
                    lineTo(12f, 10f)
                    lineTo(13f, 10f)
                    close()
                }
            }
        }.build()

        return _Errormark!!
    }

private var _Errormark: ImageVector? = null

