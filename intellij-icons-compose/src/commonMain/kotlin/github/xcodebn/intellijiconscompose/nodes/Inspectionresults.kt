package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inspectionresults: ImageVector
    get() {
        if (_Inspectionresults != null) return _Inspectionresults!!

        _Inspectionresults = ImageVector.Builder(
            name = "Inspectionresults",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(1f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 10f)
                lineTo(15f, 10f)
                lineTo(15f, 4f)
                lineTo(8f, 4f)
                lineTo(7f, 3f)
                curveTo(6.22f, 2.29f, 5.62f, 2.03f, 4.98f, 2.00f)
                lineTo(1f, 2f)
                curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                lineTo(1f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(9f, 16f)
                lineTo(12f, 16f)
                lineTo(12f, 11f)
                lineTo(9f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF4AF3D))
            ) {
                moveTo(13f, 16f)
                lineTo(16f, 16f)
                lineTo(16f, 11f)
                lineTo(13f, 11f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(1f, 13f)
                    lineTo(8f, 13f)
                    lineTo(8f, 10f)
                    lineTo(15f, 10f)
                    lineTo(15f, 4f)
                    lineTo(8f, 4f)
                    lineTo(7f, 3f)
                    curveTo(6.22f, 2.29f, 5.62f, 2.03f, 4.98f, 2.00f)
                    lineTo(1f, 2f)
                    curveTo(1.02f, 2.00f, 1.00f, 2.02f, 1.00f, 2.05f)
                    lineTo(1f, 13f)
                    close()
                }
            }
        }.build()

        return _Inspectionresults!!
    }

private var _Inspectionresults: ImageVector? = null

